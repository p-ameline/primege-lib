package com.primege.server.csv;

import java.util.ArrayList;
import java.util.List;

/**
 * Referencing a "record": set of information either global or attached to a master information (site...) 
 * 
 */
public class CsvRecord
{   
	protected int _iMasterId ;

	protected List<CsvInformation> _aInformations = new ArrayList<CsvInformation>() ;

	/**
	 * Default Constructor
	 *
	 */
	public CsvRecord(final int iMasterId) {
		_iMasterId = iMasterId ;
	}

	public int getMasterId() {
		return _iMasterId ;
	}

	public List<CsvInformation> getInformations() {
		return _aInformations ;
	}
	public void addToInformations(CsvInformation info) {
		_aInformations.add(info) ;
	}
}
