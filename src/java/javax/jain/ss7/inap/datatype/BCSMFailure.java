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
 *  File Name     : BCSMFailure.java
 *  Approver      : Jain Inap Edit Group
 *  Version       : 1.0
 *
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package javax.jain.ss7.inap.datatype;


import java.io.*;
import java.util.*;
import javax.jain.ss7.inap.constants.*;
import javax.jain.*;

/**
This class defines the BCSMfailure Datatype
*/

public class BCSMFailure implements java.io.Serializable{

    private LegID legID;
    
    private String reason;
    private boolean isReason =false ;
    
    private Cause cause;
    private boolean isCause =false;

/**
Constructor For BCSMFailure
*/
	public BCSMFailure(LegID legID)
	{
		setLegID(legID);
	}
	
//---------------------------------------------	

/**
Gets  Leg ID
*/

    public LegID getLegID()
    {
        return legID;
    }

/**
Sets Leg ID
*/
    public void setLegID( LegID legID)
    {
        this.legID=legID;
    }

//---------------------------------------------	

/**
Gets Reason
*/
    public java.lang.String  getReason () throws ParameterNotSetException
    {
        if(isReasonPresent())
		{
        	return reason ;
        }
		else
		{
               throw new ParameterNotSetException();
        }          
    }

/**
Sets Reason
*/


    public void setReason ( String  reason )
    {
        this.reason = reason ;
       	isReason = true;        
    }

/**
 Indicates if the Reason optional parameter is present .
Returns:TRUE if present , FALSE otherwise.
*/
    public boolean  isReasonPresent ()
    {
        return isReason ;
    }



//---------------------------------------------	

/**
Gets Cause
*/

    public Cause getCause () throws ParameterNotSetException
    {
         if(isCausePresent ())
		 {
         	return cause ;
         }
		 else
		 {
              throw new ParameterNotSetException();
         }
    }

/**
Sets Cause
*/


    public void setCause ( Cause  cause )
    {
        this.cause =cause ;
        isCause=true; 
    }

/**
Indicates if the Cause optional parameter is present .
Returns:TRUE if present , FALSE otherwise.
*/
    public boolean isCausePresent ()
    {
        return isCause ;
    }


//--------------------------------------------------

}