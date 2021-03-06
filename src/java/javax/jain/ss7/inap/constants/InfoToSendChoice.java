/*
 @(#) src/java/javax/jain/ss7/inap/constants/InfoToSendChoice.java <p>
 
 Copyright &copy; 2008-2015  Monavacon Limited <a href="http://www.monavacon.com/">&lt;http://www.monavacon.com/&gt;</a>. <br>
 Copyright &copy; 2001-2008  OpenSS7 Corporation <a href="http://www.openss7.com/">&lt;http://www.openss7.com/&gt;</a>. <br>
 Copyright &copy; 1997-2001  Brian F. G. Bidulock <a href="mailto:bidulock@openss7.org">&lt;bidulock@openss7.org&gt;</a>. <p>
 
 All Rights Reserved. <p>
 
 This program is free software: you can redistribute it and/or modify it under
 the terms of the GNU Affero General Public License as published by the Free
 Software Foundation, version 3 of the license. <p>
 
 This program is distributed in the hope that it will be useful, but <b>WITHOUT
 ANY WARRANTY</b>; without even the implied warranty of <b>MERCHANTABILITY</b>
 or <b>FITNESS FOR A PARTICULAR PURPOSE</b>.  See the GNU Affero General Public
 License for more details. <p>
 
 You should have received a copy of the GNU Affero General Public License along
 with this program.  If not, see
 <a href="http://www.gnu.org/licenses/">&lt;http://www.gnu.org/licenses/&gt</a>,
 or write to the Free Software Foundation, Inc., 675 Mass Ave, Cambridge, MA
 02139, USA. <p>
 
 <em>U.S. GOVERNMENT RESTRICTED RIGHTS</em>.  If you are licensing this
 Software on behalf of the U.S. Government ("Government"), the following
 provisions apply to you.  If the Software is supplied by the Department of
 Defense ("DoD"), it is classified as "Commercial Computer Software" under
 paragraph 252.227-7014 of the DoD Supplement to the Federal Acquisition
 Regulations ("DFARS") (or any successor regulations) and the Government is
 acquiring only the license rights granted herein (the license rights
 customarily provided to non-Government users).  If the Software is supplied to
 any unit or agency of the Government other than DoD, it is classified as
 "Restricted Computer Software" and the Government's rights in the Software are
 defined in paragraph 52.227-19 of the Federal Acquisition Regulations ("FAR")
 (or any successor regulations) or, in the cases of NASA, in paragraph
 18.52.227-86 of the NASA Supplement to the FAR (or any successor regulations). <p>
 
 Commercial licensing and support of this software is available from OpenSS7
 Corporation at a fee.  See
 <a href="http://www.openss7.com/">http://www.openss7.com/</a>
 */

package javax.jain.ss7.inap.constants;

import javax.jain.ss7.inap.*;
import javax.jain.ss7.*;
import javax.jain.*;

/**
  * This class indicates the InfoToSend choice.
  * @version 1.2.2
  * @author Monavacon Limited.
  */
public class InfoToSendChoice {
    /** Internal integer value: MESSAGE_ID.  */
    public static final int M_MESSAGE_ID = 0;
    /** Internal integer value: TONEID.  */
    public static final int M_TONEID = 1;
    /** Internal integer value: DISPLAY_INFORMATION.  */
    public static final int M_DISPLAY_INFORMATION = 2;
    /** Private internal integer value of constant class.  */
    private int infoToSendChoice;
    /** Private constructor for constant class.
      * @param infoToSendChoice
      * Internal integer value of constant class.  */
    private InfoToSendChoice(int infoToSendChoice) {
        this.infoToSendChoice = infoToSendChoice;
    }
    /** InfoToSendChoice :MESSAGE_ID */
    public static final InfoToSendChoice MESSAGE_ID
        = new InfoToSendChoice(M_MESSAGE_ID);
    /** InfoToSendChoice :TONEID */
    public static final InfoToSendChoice TONEID
        = new InfoToSendChoice(M_TONEID );
    /** InfoToSendChoice :  DISPLAY_INFORMATION */
    public static final InfoToSendChoice DISPLAY_INFORMATION
        = new InfoToSendChoice(M_DISPLAY_INFORMATION );
    /** Gets the integer value representation of the Constant class.
      * @return
      * Internal integer value of constant class.  */
    public int getInfoToSendChoice() {
        return infoToSendChoice;
    }
}

// vim: sw=4 et tw=72 com=srO\:/**,mb\:*,ex\:*/,srO\:/*,mb\:*,ex\:*/,b\:TRANS,\://,b\:#,\:%,\:XCOMM,n\:>,fb\:-
