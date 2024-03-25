package com.primege.shared.rpc;

import java.util.List;

import com.primege.shared.database.FormDataData;
import com.primege.shared.model.FormBlockModel;
import com.primege.shared.model.TraitPath;

import net.customware.gwt.dispatch.shared.Action;

public class RegisterFormAction implements Action<RegisterFormResult> 
{	
	private int                          _iUserId ;
	private List<TraitPath>              _aTraits ;
	private FormBlockModel<FormDataData> _formBlock ;
	
	/**
	 * Void constructor, needed for serialization purposes
	 */
	public RegisterFormAction() 
	{
		super() ;
		
		_iUserId   = 0 ;
		_formBlock = null ;
		_aTraits   = null ;
	}
	
	/**
	 * Plain vanilla constructor
	 */
	public RegisterFormAction(int iUserId, final FormBlockModel<FormDataData> formBlock, final List<TraitPath> aTraits)
	{
		_iUserId   = iUserId ;
		_formBlock = formBlock ;
		_aTraits   = aTraits ;
	}

	public int getUserId() {
		return _iUserId;
	}
	public void setUserId(int iUserId) {
		_iUserId = iUserId ;
	}
	
	public FormBlockModel<FormDataData> getFormBlock() {
		return _formBlock ;
	}
	public void setFormBlock(FormBlockModel<FormDataData> formBlock) {
		_formBlock = formBlock ;
	}
	
	public List<TraitPath> getTraits() {
		return _aTraits ;
	}
	public void setTraits(List<TraitPath> aTraits) {
		_aTraits = aTraits ;
	}
}
