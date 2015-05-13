package cn.ac.ict.textclass.sim;

/**
 * provide method to calculate similarity of two vector
 * @author GuoTianyou
 * @email fortianyou@gmail.com
 * @version Create time: 2015��5��13�� ����11:41:47
 */
public interface Similarity {
	
	/**
	 * Get the similarity fo p and q
	 * @param p
	 * @param q
	 * @return similarity
	 */
	public double getSimilarity(double[] p,double[] q);
}
