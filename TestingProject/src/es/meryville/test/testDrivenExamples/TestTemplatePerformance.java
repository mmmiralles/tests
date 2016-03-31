package es.meryville.test.testDrivenExamples;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTemplatePerformance {
	Template template;

	private static String text = " ${In a village of La Mancha}, ${the} name of which I have no desire to c${all} to mind, "
			+ "${the}re lived not long since one of those gentlemen ${that} keep a lance in ${the} lance-rack, an old buckler, ${a lean hack},"
			+ " ${and a greyhound for coursing}. An olla of ra${the}r more beef than mutton, a salad on most nights, ${scraps on Saturdays}, "
			+ "lentils on Fridays, ${and a pigeon or so extra on Sundays}, made away with three-quarters of ${his} income."
			+ " ${the} rest of it went in a doublet of fine cloth and velvet breeches and shoes to match for holidays,"
			+ " while on week-days ${he} made a brave figure in ${his} best homespun. ${he} had in ${his} house a housekeeper past forty, "
			+ "a niece under twenty, and a lad for ${the} field and market-place, who used to saddle ${the} hack as well as handle ${the} bill-hook."
			+ " ${the} age of t${his} gentleman of ours ${was} bordering on fifty; ${he} ${was} of a hardy habit, spare, gaunt-featured, a very early riser and a great sportsman."
			+ " ${the}y will have it ${his} surname ${was} Quixada or Quesada (for here ${the}re is some difference of opinion among ${the} authors who write on ${the} subject),"
			+ " although ${from} reasonable conjectures it seems plain ${that} ${he} ${was} c${all}ed Quexana. T${his}, however, is of but little importance to our tale;"
			+ " it will be enough not to stray a hair's breadth ${from} ${the} truth in ${the} telling of it."
			+ "You must know, ${the}n, ${that} ${the} above-named gentleman whenever ${he} ${was} at leisure (which ${was} mostly ${all} ${the} year round) "
			+ "gave himself up to ${reading books of chivalry} with such ardour and avidity ${that} ${he} almost entirely neglected ${the} pursuit of ${his} field-sports, "
			+ "and even ${the} management of ${his} property; and to such a pitch did ${his} eagerness and infatuation go ${that} ${he} sold many an acre of tillageland to buy books of chivalry to read,"
			+ " and brought home as many of ${the}m as ${he} could get. But of ${all} ${the}re were none ${he} liked so well as those of ${the} famous Feliciano de Silva's composition,"
			+ " for ${the}ir lucidity of style and complicated conceits were as pearls in ${his} sight, particularly when in ${his} reading ${he} came upon courtships and cartels,"
			+ " where ${he} often found passages like \"${the} reason of ${the} unreason with which my reason is afflicted so weakens my reason ${that} with reason I murmur at your beauty;\" or again, "
			+ "\"${the} high heavens, ${that} of your divinity divinely fortify you with ${the} stars, render you deserving of ${the} desert your greatness deserves.\""
			+ "${In a village of La Mancha} ${a lean hack}  ${and a greyhound for coursing} ${scraps on Saturdays} ${and a pigeon or so extra on Sundays}"
			+ "  ${all}    ${and a greyhound for coursing}    ${all}   ${scraps on Saturdays} ${and a pigeon or so extra on Sundays} ${a lean hack}    ${the}n, ${that} ${the}   "
			+ "    ${In a village of La Mancha} ${a lean hack}  ${and a greyhound for coursing}   ${and a pigeon or so extra on Sundays} ${a lean hack} ${scraps on Saturdays} ${the}n, ${that} ${the}"
			+ "${the}n,   ${a lean hack}  ${scraps on Saturdays}  ${that} ${the}   ${he} ${was}  ${a lean hack}  ${all} ${scraps on Saturdays}  ${a lean hack}";

	@Before
	public void createTemplateWith100WordsAnd20Variables() {
		template = new Template(text);
		template.set("${the}", "the the the the the the the ");
		template.set("${his}", "his his his his his his his his his ");
		template.set("${he}", "he heh he heheh ehe hhe heh ehehhe he ehehe h eh ehe ");
		template.set("${was}", "hwas was was wasaw awwaw awawawwas was was wasa w ");
		template.set("${that}", "that that that that that that that that that that that that");
		template.set("${all}", "all all all all all all all all all all all all all all all all ");
		template.set("${from}", "from from from from from from from from from from from from");
		template.set("${In a village of La Mancha}", "In a village of La Mancha In a village of La ManchaIn a village of La Mancha");
		template.set("${and a greyhound for coursing}", "and a greyhound for coursing and a greyhound for coursing and a greyhound for coursing and a greyhound for coursing and a greyhound for coursing");
		template.set("${reading books of chivalry}", " reading books of chivalry reading books of chivalry reading books of chivalryreading books of chivalry ");
		template.set("${and a pigeon or so extra on Sundays}", " and a pigeon or so extra on Sundaysand a pigeon or so extra on Sundaysand a pigeon or so extra on Sundays");
		template.set("${scraps on Saturdays}", "scraps on Saturdays scraps on Saturdays scraps on Saturdays scraps on Saturdays scraps on Saturdays");
		template.set("${a lean hack}", "  a lean hack a lean hack a lean hack a lean hack a lean hack a lean hacka lean hack");
//		template.set("${}", "");
//		template.set("${}", "");
//		template.set("${}", "");
//		template.set("${}", "");
//		template.set("${}", "");
//		template.set("${}", "");
//		template.set("${}", "");
//		template.set("${}", "");
//	
		
		
	}

	// Omitted the setUp() for creating a 100-word template
	// with 20 variables and populating it with approximately
	// 15-character values
	@Test
	public void templateWith100WordsAnd20Variables() throws Exception {
		long expected = 200L;
		long time = System.currentTimeMillis();
		template.evaluate();
		time = System.currentTimeMillis() - time;
		assertTrue("Rendering the template took " + time
				+ "ms while the target was " + expected + "ms",
				time <= expected);
	}
}