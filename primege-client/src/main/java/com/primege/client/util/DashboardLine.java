package com.primege.client.util;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.client.ui.FlexTable;

/**
 * Referencing a dashboard's line for a given path 
 * 
 */
public class DashboardLine
{   
	private int                         _iSiteId ;
	private String                      _sPath ;
	private List<FormControlOptionData> _aOptions ;
	private String                      _sType ;

	private FlexTable _flexTable ;
	private int       _iLine ;
	private int       _iRefCol ;

	/**
	 * Default Constructor
	 *
	 */
	public DashboardLine(final int iSiteId, final String sPath, final String sType, final FlexTable flexTable, final int iLine, final int iRefCol, final List<FormControlOptionData> aOptions)
	{
		_iSiteId = iSiteId ;

		if (null == sPath)
			_sPath = "" ;
		else
			_sPath = sPath ;

		if (null == sType)
			_sType = "" ;
		else
			_sType = sType ;

		_flexTable = flexTable ;
		_iLine     = iLine ;
		_iRefCol   = iRefCol ;

		initOptions(aOptions) ;
	}

	/**
	 * Copy Constructor
	 *
	 */
	public DashboardLine(final DashboardLine model)
	{
		_iSiteId   = model._iSiteId ; 	
		_sPath     = model._sPath ;
		_sType     = model._sType ;
		_flexTable = model._flexTable ;
		_iLine     = model._iLine ;
		_iRefCol   = model._iRefCol ;

		initOptions(model._aOptions) ;
	}

	public int getSiteId() {
		return _iSiteId ;
	}

	public String getPath() {
		return _sPath ;
	}

	public String getType() {
		return _sType ;
	}

	public FlexTable getFlexTable() {
		return _flexTable ;
	}

	public int getLine() {
		return _iLine ;
	}

	public int getRefCol() {
		return _iRefCol ;
	}

	public List<FormControlOptionData> getOptions() {
		return _aOptions ;
	}

	protected void initOptions(List<FormControlOptionData> aOptions)
	{
		if ((null == aOptions) || (aOptions.isEmpty()))
		{
			if (null != _aOptions)
				_aOptions.clear() ;

			return ;
		}

		if (null == _aOptions)
			_aOptions = new ArrayList<FormControlOptionData>() ;

		for (FormControlOptionData option : aOptions)
			_aOptions.add(new FormControlOptionData(option)) ;
	}
}
