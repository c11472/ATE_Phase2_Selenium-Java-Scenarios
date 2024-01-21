import org.testng.annotations.Test;

public class TC001 {
	@Test
	public void fun_test1() {

		String nm = "hello testng";
		StringBuffer sb = new StringBuffer(nm);
		StringBuffer res = sb.reverse();
		String result = res.toString();

	}

	@Test
  public void fun_test2() {
	  int arr[] = {1,3,4,5};
	  for(int i:arr) {
		  System.out.println(i+ " ");
	  }
	  
  }
