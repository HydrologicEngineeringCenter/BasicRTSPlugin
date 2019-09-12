/**
 * 
 */
package basicrtsplugin;

import org.jdom.Document;

import hec2.plugin.selfcontained.SelfContainedPluginAlt;

/**
 * @author RTS Power User
 *
 */
public class BasicRTSAlternative extends SelfContainedPluginAlt
{
	public BasicRTSAlternative()
	{
		super();
	}
	/* (non-Javadoc)
	 * @see com.rma.model.Computable#isComputable()
	 */
	@Override
	public boolean isComputable()
	{
		// TODO Auto-generated method stub
		System.out.println("isComputable TODO implement me");
		return false;
	}

	/* (non-Javadoc)
	 * @see com.rma.model.Computable#compute()
	 */
	@Override
	public boolean compute()
	{
		// TODO Auto-generated method stub
		System.out.println("compute TODO implement me");
		return false;
	}

	/* (non-Javadoc)
	 * @see com.rma.model.Computable#getModelCount()
	 */
	@Override
	public int getModelCount()
	{
		// TODO Auto-generated method stub
		System.out.println("getModelCount TODO implement me");
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.rma.model.Computable#cancelCompute()
	 */
	@Override
	public boolean cancelCompute()
	{
		// TODO Auto-generated method stub
		System.out.println("cancelCompute TODO implement me");
		return false;
	}

	/* (non-Javadoc)
	 * @see com.rma.model.Computable#getLogFile()
	 */
	@Override
	public String getLogFile()
	{
		// TODO Auto-generated method stub
		System.out.println("getLogFile TODO implement me");
		return null;
	}

	/* (non-Javadoc)
	 * @see com.rma.model.AbstractXMLManager#loadDocument(org.jdom.Document)
	 */
	@Override
	protected boolean loadDocument(Document doc)
	{
		// TODO Auto-generated method stub
		System.out.println("loadDocument TODO implement me");
		return false;
	}

}
