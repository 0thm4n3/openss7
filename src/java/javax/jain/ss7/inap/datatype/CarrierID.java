/*
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 *  Copyrights:
 *
 *  Copyright - 1999 Sun Microsystems, Inc. All rights reserved.
 *  901 San Antonio Road, Palo Alto, California 94043, U.S.A.
 *
 *  This product and related documentation are protected by copyright and
 *  distributed under licenses restricting its use, copying, distribution, and
 *  decompilation. No part of this product or related documentation may be
 *  reproduced in any form by any means without prior written authorization of
 *  Sun and its licensors, if any.
 *
 *  RESTRICTED RIGHTS LEGEND: Use, duplication, or disclosure by the United
 *  States Government is subject to the restrictions set forth in DFARS
 *  252.227-7013 (c)(1)(ii) and FAR 52.227-19.
 *
 *  The product described in this manual may be protected by one or more U.S.
 *  patents, foreign patents, or pending applications.
 *
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 *  Author:
 *
 *  Mahindra British Telecom
 *  155 , Bombay - Pune Road 
 *  Pimpri ,
 *  Pune - 411 018.
 *
 *  Module Name   : JAIN INAP API
 *  File Name     : CarrierID.java
 *  Approver      : Jain Inap Edit Group
 *  Version       : 1.0
 *
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package javax.jain.ss7.inap.datatype;


import java.io.*;
import java.util.*;
import javax.jain.ss7.inap.constants.*;
/**
This Class defines the CarrierID DataType 
*/

public class CarrierID  implements java.io.Serializable
{

    private int numberOfDigits;
    
    private String digits;

/**
Constructor For CarrierID
*/
	public CarrierID(int numberOfDigits, java.lang.String digits)
	{
		setNumberOfDigits(numberOfDigits);
		setDigits (digits);
	}
	
//------------------------------------------	

/**
Gets Number Of Digits
*/
    public int getNumberOfDigits()
    {
        return numberOfDigits ;
    }

/**
Sets Number Of Digits
*/

    public void  setNumberOfDigits (int numberOfDigits)
    {
        this.numberOfDigits = numberOfDigits ;
    }

//------------------------------------------	

/**
Gets Carrier Digits
*/
    public java.lang.String getDigits()
    {
        return digits ;
    }

/**
Sets Carrier Digits
*/

    public void  setDigits (java.lang.String digits)
    {
        this.digits = digits ;
    }
//------------------------------------------	

}