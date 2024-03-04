
public class TScore {

	private enum domain {
		PHYSICAL_FUNCTION, PAIN_INTERFERENCE, FATIGUE, SLEEP, COGNITIVE, DEPRESSION, 
		ANXIETY, SOCIAL, SELF_EFFICACY, MANAGE_SYMPTOMS };
	double tscore;
	int activityIndex;
	domain domainName;
	
	public TScore(double tscore) {
		this.tscore = tscore;
		
		//this is the code for if there is more than one tscore 
//		if(activityIndex == 0) {
//			domainName = domain.PHYSICAL_FUNCTION;
//		} else if(activityIndex == 1) {
//			domainName = domain.PAIN_INTERFERENCE;
//		} else if(activityIndex == 2) {
//			domainName = domain.FATIGUE;
//		} else if(activityIndex == 3) {
//			domainName = domain.SLEEP;
//		} else if(activityIndex == 4) {
//			domainName = domain.COGNITIVE;
//		} else if(activityIndex == 5) {
//			domainName = domain.DEPRESSION;
//		} else if(activityIndex == 6) {
//			domainName = domain.ANXIETY;
//		} else if(activityIndex == 7) {
//			domainName = domain.SOCIAL;
//		} else if(activityIndex == 8) {
//			domainName = domain.SELF_EFFICACY;
//		} else if(activityIndex == 9) {
//			domainName = domain.MANAGE_SYMPTOMS;
//		}
	}
}
