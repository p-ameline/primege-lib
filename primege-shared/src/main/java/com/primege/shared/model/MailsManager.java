package com.primege.shared.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;

import com.primege.shared.util.MailTo;

public abstract class MailsManager implements IsSerializable
{
	private String       _sMailTemplate ;
	private String       _sMailFrom ;
	private List<MailTo> _aMailAddresses = new ArrayList<MailTo>() ;
	private String       _sMailCaption ;
	private boolean      _bMailPrntScreen ;

	public MailsManager()
	{
		_sMailTemplate   = "" ;
		_sMailFrom       = "" ;
		_sMailCaption    = "" ;
		_bMailPrntScreen = true ;
	}

	/**
	 * Initialize all information from another MailsManager
	 * 
	 * @param model MailsManager to initialize from
	 */
	public void initFromModel(final MailsManager model)
	{
		reset() ;

		if (null == model)
			return ;

		setMailAddresses(model._aMailAddresses) ;

		setMailTemplate(model._sMailTemplate) ;
		setMailFrom(model._sMailFrom) ;
		setMailCaption(model._sMailCaption) ;
		setPrintScreenAttached(model._bMailPrntScreen) ;
	}

	/**
	 * This reset function only takes care of presenter's internal information, it shouldn't interfere with the display
	 * 
	 * */
	protected void reset()
	{
		_aMailAddresses.clear() ;

		_sMailTemplate   = "" ;
		_sMailFrom       = "" ;
		_sMailCaption    = "" ;
		_bMailPrntScreen = true ;
	}

	public void clearMailAddresses() {
		_aMailAddresses.clear() ;
	}

	/**
	 * Add an attribute � la <code>to="$trainee$"</code> into the list of MailTo
	 * 
	 * @param sAttributeName    Attribute name, either to, cc or bcc
	 * @param sAttributeContent Content in the form of roles separated by a ';'
	 */
	public void addMailsTo(final String sAttributeName, final String sAttributeContent) {
		MailsManager.addMailsTo(_aMailAddresses, sAttributeName, sAttributeContent) ;
	}

	/**
	 * Add an attribute � la <code>to="$trainee$"</code> into the list of MailTo
	 * 
	 * @param aMailAddresses    List to add the new information to
	 * @param sAttributeName    Attribute name, either to, cc or bcc
	 * @param sAttributeContent Content in the form of roles separated by a ';'
	 */
	public static void addMailsTo(List<MailTo> aMailAddresses, final String sAttributeName, final String sAttributeContent)
	{
		if ((null == sAttributeName) || "".equals(sAttributeName) || (null == sAttributeContent) || "".equals(sAttributeContent))
			return ;

		MailTo.RecipientType iType = MailTo.RecipientType.Undefined ;

		if      ("to".equalsIgnoreCase(sAttributeName))
			iType = MailTo.RecipientType.To ;
		else if ("cc".equalsIgnoreCase(sAttributeName))
			iType = MailTo.RecipientType.Cc ;
		else if ("bcc".equalsIgnoreCase(sAttributeName))
			iType = MailTo.RecipientType.Bcc ;

		aMailAddresses.add(new MailTo(sAttributeContent, iType)) ;
	}

	public String getMailTemplate() {
		return _sMailTemplate ;
	}
	public void setMailTemplate(final String sMailTemplate) {
		_sMailTemplate = (null == sMailTemplate) ? "" : sMailTemplate ;
	}

	public String getMailFrom() {
		return _sMailFrom ;
	}
	public void setMailFrom(final String sMailFrom) {
		_sMailFrom = (null == sMailFrom) ? "" : sMailFrom ;
	}

	public List<MailTo> getMailAddresses() {
		return _aMailAddresses ;
	}
	public void addMailAddress(MailTo address)
	{
		if ((null == address) || _aMailAddresses.contains(address))
			return ;

		_aMailAddresses.add(address) ;
	}
	public void setMailAddresses(List<MailTo> aMailAddresses)
	{
		_aMailAddresses.clear() ;

		if ((null == aMailAddresses) || aMailAddresses.isEmpty())
			return ;

		_aMailAddresses.addAll(aMailAddresses) ;
	}

	public String getMailCaption() {
		return _sMailCaption ;
	}
	public void setMailCaption(final String sMailCaption) {
		_sMailCaption = (null == sMailCaption) ? "" : sMailCaption ;
	}

	public boolean isPrintScreenAttached() {
		return _bMailPrntScreen;
	}
	public void setPrintScreenAttached(boolean bMailPrntScreen) {
		_bMailPrntScreen = bMailPrntScreen ;
	}
}
