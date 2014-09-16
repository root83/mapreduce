package skill.coach;

import java.io.IOException;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class TestReducer extends Reducer<Text, Text, NullWritable, Text> {
      protected void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
            String grp = key.toString();
            Integer cnt = 0;
            
            for(Text value : values) {
                  cnt += Integer.parseInt(value.toString());
            }
            
            context.write(NullWritable.get(), new Text(grp + "=" + cnt.toString()));
            context.getCounter("COUNTER", "REDUCE_NUM_RECORD").increment(1);
      }
}
