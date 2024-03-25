package com.primege.shared.rpc_util;

import java.util.ArrayList;
import java.util.List;

import net.customware.gwt.dispatch.shared.Action;

/**
 * Object used to get a list of Flex records from a list of codes 
 */
public class GetDictionnaryListFromCodesAction implements Action<GetDictionnaryListFromCodesResult> 
{
	private int                 _iUserId ;
	private List<SearchElement> _aCodes = new ArrayList<SearchElement>() ;

	/**
	 * Plain vanilla constructor where user identifier is expressed as an <code>int</code>
	 */
	public GetDictionnaryListFromCodesAction(final int iUserId, final List<SearchElement> aCodes) 
	{
		super() ;

		reset() ;

		_iUserId = iUserId ;

		if (null != aCodes)
			_aCodes.addAll(aCodes) ;
	}

	/**
	 * Void constructor for serialization purposes
	 */
	public GetDictionnaryListFromCodesAction() 
	{
		super() ;

		reset() ;
	}

	protected void reset()
	{
		_iUserId = -1 ;

		_aCodes.clear() ;
	}

	public int getUserId() {
		return _iUserId ;
	}

	public List<SearchElement> getCodes() {
		return _aCodes ;
	}
}
