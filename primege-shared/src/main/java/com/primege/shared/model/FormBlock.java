package com.primege.shared.model ;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable ;

import com.primege.shared.database.FormDataData;
import com.primege.shared.database.FormDataModel;
import com.primege.shared.database.FormLink;

/**
 * A document, its data and its annotations
 * 
 * Created: 11 Jul 2011
 *
 * Author: PA
 * 
 */
public class FormBlock<T extends FormDataData> extends FormBlockModel<T> implements IsSerializable 
{
	private FormDataModel  _document ;
	
	private List<FormLink> _aLinks = new ArrayList<FormLink>() ;
	
	/**
	 * Default constructor (with zero information)
	 */
	public FormBlock() 
	{
		super() ;
		
		_document = null ;
	}

	/**
	 * Plain vanilla "no annotations" constructor 
	 */
	public FormBlock(final String sLabel, final FormDataModel document, final List<T> aData) 
	{
		super(sLabel, aData) ;
		
		_document = null ;
		
		setDocumentLabel(document) ;
	}
	
	/**
	 * Plain vanilla constructor 
	 */
	public FormBlock(final String sLabel, final FormDataModel document, final List<T> aData, final List<FormLink> aLinks /*, final List<FormAnnotationBlock<T>> aAnnotations*/) 
	{
		super(sLabel, aData) ;
		
		_document = null ;
		
		setDocumentLabel(document) ;
		setLinks(aLinks) ;
		// setAnnotations(aAnnotations) ;
	}
	
	/**
	 * Copy constructor 
	 */
	public FormBlock(final FormBlock<T> model) 
	{
		super() ;

		_document = null ;
		
		initFromFormBlock(model) ;
	}
	
	public void reset()
	{
		reset4Model() ;
		
		if (null != _document)
			_document.reset() ;
		
		_aLinks.clear() ;
		// _aAnnotations.clear() ;
	}
	
	public void initFromFormBlock(final FormBlock<T> model)
	{
		reset() ;
		
		if (null == model)
			return ;
		
		initFromFormBlock4Model(model) ;
		
		setDocumentLabel(model._document) ;
		setLinks(model._aLinks) ;
		// setAnnotations(model._aAnnotations) ;
	}
		
	public FormDataModel getDocumentLabel() {
		return _document ;
	}
	public void setDocumentLabel(final FormDataModel document) {
		_document = document ;
	}
	
	public List<FormLink> getLinks() {
		return _aLinks ;
	}
	public void setLinks(final List<FormLink> aLinks)
	{
		_aLinks.clear() ;
		
		if (null != aLinks)
			_aLinks = aLinks ;
	}
	
	/**
	 * Add a link
	 */
	public void addLink(FormLink link)
	{
		if (null == link)
      return ;
		
		_aLinks.add(link) ;
	}
	
	/**
	 * Get document's form identifier
	 * 
	 * @return <code>-1</code> if there is no document yet, its form identifier if a document exists
	 */
	public int getFormId()
	{
		if (null == _document)
			return -1 ;
		
		return _document.getFormId() ;
	}
	
	/**
	 * Get document's action identifier
	 * 
	 * @return <code>""</code> if there is no document yet, its action identifier if a document exists
	 */
	public String getActionId()
	{
		if (null == _document)
			return "" ;
		
		return _document.getActionId() ;
	}
	
/*
	public List<FormAnnotationBlock<T>> getAnnotations() {
		return _aAnnotations ;
	}
	public void setAnnotations(final List<FormAnnotationBlock<T>> aAnnotations)
	{
		_aAnnotations.clear() ;
		
		if (null != aAnnotations)
			_aAnnotations = aAnnotations ;
	}
*/
	
	/**
	 * Add a data, or update it if some information with the same path already exists
	 */
/*
	public void addAnnotation(FormAnnotationBlock<T> aAnnotation)
	{
		if (null == aAnnotation)
      return ;
		
		_aAnnotations.add(aAnnotation) ;
	}
*/
}
