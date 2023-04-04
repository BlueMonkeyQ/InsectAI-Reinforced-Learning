import jig.misc.rd.ai.AgentFactory;
import jig.misc.rd.ai.RobotDefenseAgent;




public class MarcusFactory implements AgentFactory {

	public RobotDefenseAgent createAgent(String name, String agentResource) {
		return new MarcusAgent();
	}

}
