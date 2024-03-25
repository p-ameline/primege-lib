package com.primege.client.util;

import com.google.gwt.user.client.ui.Widget;

/**
 * Referencing an option inside a control
 * 
 */
public class FormControlOption
{   
  private String _sPath ;
  private String _sCaption ;
  
  private Widget _widget ;
  
  /**
   * Default Constructor
   *
   */
  public FormControlOption(String sPath, Widget widget, String sCaption)
  {
    if (null == sPath)
    	_sPath = "" ;
    else
    	_sPath = sPath ;
    
    if (null == sCaption)
    	_sCaption = "" ;
    else
    	_sCaption = sCaption ;
    
    _widget = widget ;
  }

  public String getPath() {
  	return _sPath ;
  }
  
  public String getCaption() {
  	return _sCaption ;
  }
  
  public Widget getWidget() {
  	return _widget ;
  }
}
