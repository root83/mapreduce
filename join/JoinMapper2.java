package skill.coach;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class JoinMapper2 extends Mapper<LongWritable, Text, TextPair, TextPair> {
	@Override
    protected void setup(Context context) throws IOException, InterruptedException {
		//Called once at the beginning of the task.
		Configuration conf = context.getConfiguration();
	}
	
	@Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
		//Called once for each key/value pair in the input split.
		
		String column[] = value.toString().split(",");
		
		String acc_idx = column[0];
		String gender = column[4];
		
		context.write(new TextPair(acc_idx, "1"), new TextPair(gender, "1"));
		
		context.getCounter("COUNTER", "MAPPER_NUM_RECORD_2").increment(1);
	}
	
	@Override
    protected void cleanup(Context context) throws IOException, InterruptedException {
		//Called once at the end of the task.
	}
}
