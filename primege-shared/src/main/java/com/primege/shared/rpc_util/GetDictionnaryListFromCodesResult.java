package com.primege.shared.rpc_util;

import java.util.ArrayList;
import java.util.List;

import net.customware.gwt.dispatch.shared.Result;

public class GetDictionnaryListFromCodesResult implements Result
{
	private List<ResultElement> _aResults = new ArrayList<ResultElement>() ;
	private String              _sMessage ;

	/**
	 * */
	public GetDictionnaryListFromCodesResult()
	{
		super() ;

		_sMessage = "" ;
	}

	/**
	 * @param sMessage
	 * */
	public GetDictionnaryListFromCodesResult(final String sMessage, final List<ResultElement> aResults)
	{
		super() ;

		_sMessage = sMessage ;

		if ((null != aResults) && (false == aResults.isEmpty()))
			_aResults.addAll(aResults) ;
	}

	public String getMessage() {
		return _sMessage ;
	}
	public void setMessage(String sMessage) {
		_sMessage = sMessage ;
	}

	public List<ResultElement> getResults() {
		return _aResults ;
	}

	public void addResult(final ResultElement result)
	{
		if ((null != result) && (false == _aResults.contains(result)))
			_aResults.add(result) ;
	}
}
