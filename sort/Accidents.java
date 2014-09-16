package skill.coach;

import org.apache.hadoop.io.WritableComparable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Accidents implements WritableComparable<Accidents> {
  private int year;
  private int month;
  private int condition;
  
  public int getYear() {
    return year;
  }
  
  public int getMonth() {
    return month;
  }
  
  public int getCondition() {
    return condition;
  }
  
  public void setYear(int year) {
    this.year = year;
  }
  
  public void setMonth(int month) {
    this.month = month;
  }
  
  public void setCondition(int condition) {
    this.condition = condition;
  }
  
  public void write(DataOutput out) throws IOException {
    out.writeInt(year);
    out.writeInt(month);
    out.writeInt(condition);
  }
  
  public void readFields(DataInput in) throws IOException {
    year = in.readInt();
    month = in.readInt();
    condition = in.readInt();
  }
  
  public String toString() {
    return year + ":" + condition;
  }
  
  @Override
  public int compareTo(Accidents a) {
    if(this.getYear() > a.getYear()) { 
      return 1;
    }
    else if(this.getYear() < a.getYear()) {
      return -1;
    }
    else {
      if(this.getCondition() > a.getCondition()) { 
        return 1;
      }
      else if(this.getCondition() < a.getCondition()){
        return -1;
      }
      else {
        return 0;
      }
    }
  }
}
