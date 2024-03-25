package com.primege.client.widgets;

import java.util.List;

import com.primege.shared.database.FormDataData;

/**
 * Methods all multiple form data controls must implement
 */
public interface ControlModelMulti extends ControlModelCore
{
	public void               setMultipleContent(final List<FormDataData> aContent, final String sDefaultValue) ;
	public void               setMultipleContent(final List<FormDataData> aContent) ;
	public List<FormDataData> getMultipleContent() ;
	
	public void               resetContent() ;
}
