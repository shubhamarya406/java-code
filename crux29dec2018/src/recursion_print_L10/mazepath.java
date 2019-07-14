package recursion_print_L10;

public class mazepath {

	public static void main(String[] args) {
		int cc=0;
		int cr=0;
		int er=2;
		int ec=2;
		String str=""; 
	System.out.println(mmdp(cr,cc,er,ec,str));
	}
public static int   mazepath(int cr,int cc,int er,int ec,String str)

{if(cr==er&&cc==ec)
{
	System.out.println(str);
	
   return 1;
}  
	if(cr>er||cc>ec)
		return 0;
	
	
	int ch=mazepath(cr,cc+1,er,ec,str+"h");
	
	
		int cv=mazepath(cr+1,cc,er,ec,str+"v");
	return ch+cv;
	
}
public   static int mmdp(int cr,int cc,int er,int ec,String str)
{ if(cc==ec&&cr==er)
{
	System.out.println(str);
return 1;
}
if(cc>ec||cr>er)
{
	return 0;
}
 int sum=0;
for(int i=1;i<=ec;i++)
{
	 sum=sum+mazepath(cr,cc+i,er,ec,str+"h");
}
for(int i=1;i<=er;i++)
{
	 sum=sum+mazepath(cr+i,cc,er,ec,str+"v");
}
for(int i=1;i<=ec&&i<=er;i++)
{
	 sum=sum+mazepath(cr+i,cc+i,er,ec,str+"d");
}
//int sum=ch+cv+cd;
	 return sum;
}
}
