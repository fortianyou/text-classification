package cn.ac.ict.textclass.sim;

import org.apache.log4j.Logger;

public class Similarity {
	private static Logger logger = Logger.getLogger(Similarity.class);
	
	/**
	 * calculate the consine similarity of two vector
	 * @param x
	 * @param y
	 * @return
	 */
	public static double getCosineSimilarity(double []x,double []y){
		double res = 0;
		double sx = 0;
		double sy = 0;
		if( x.length != y.length ){
			logger.error("The length of input vector is not consistent.");
			return 0;
		}
		
		for( int i = 0; i < x.length; ++ i ){
			res += x[i]*y[i];
			sx += x[i]*x[i];
			sy += y[i]*y[i];
		}
		
		
		return res/(Math.sqrt(sx)*Math.sqrt(sy));
	}
	
	/**
	 * KL measures the expectation of log-difference of p and q,
	 * where KL(p||q) = sum_i(ln(pi/qi)*pi). Note that KL measure isn't symmetric.
	 * If you want symmetric one, you may try Jensen-Shannon divergence.
	 * @param p is a probability distribution
	 * @param q is a probability distribution
	 * @return KL
	 */
	public static double getKullbackLeiblerDivergence(double []p,double[] q){
		
		if( p.length != q.length ){
			logger.error("The length of input vector is not consistent.");
			return 0;
		}
		double kl = 0;
		for( int i = 0; i < p.length; ++ i ){
			kl += Math.log(p[i]/q[i])*p[i];
		}
		return kl;
	}
	
	/**
	 * Jensen-Shanon divergence is defined as: JS(P||Q) = 1/2*KL(P||M) + 1/2*KL(Q||M), where M = 1/2( P + Q)
	 * @param p
	 * @param q
	 * @return Jensen-Shanon divergence of p and q
	 */
	public static double getJensenShanonDivergence(double []p,double []q){
		if( p.length != q.length ){
			logger.error("The length of input vector is not consistent.");
			return 0;
		}
		
		double js = 0;
		double lambda = 0.5;
		for( int i = 0; i < p.length; ++ i ){
			double m = lambda * (q[i]+p[i]) ;
			js += lambda*Math.log(p[i]/ m)*p[i];
			js += lambda*Math.log(q[i]/m )*q[i];
		}
		
		return js;
	}
}
