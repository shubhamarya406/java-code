package practice_oops.inheritance;

import practice_oops.stack;

public class dynamic_stack extends stack {
 @Override
	public void push(int item) throws Exception {
		if (isfull()) {
			int na[]=new int[this.data.length*2];
			for(int i=0;i<this.data.length;i++)
			{
				na[i]=this.data[i];
			}
        this.data=na;
		}
	super.push(item);
  }
}
