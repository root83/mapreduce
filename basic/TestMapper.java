package skill.coach;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class TestMapper extends Mapper<LongWritable, Text, Text, Text> {
      protected void map(LongWritable key, Text value, Context context) throws IOException,InterruptedException {
            String[] input = value.toString().split(",");
            
            String year = input[9].substring(6);
            String cond = input[25];
            if(cond.equals("-1")) {
                  context.getCounter("COUNTER","INVALID_STATUS").increment(1);
                  return;
            }
            
            context.write(new Text(year + ":" + cond), new Text("1"));
      }
}
