/*
 @(#) src/java/javax/sip/RequestEvent.java <p>
 
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

package javax.sip;

import javax.sip.message.*;

/**
    This class represents an Request event that is passed from a SipProvider to its SipListener.
    This specification handles the passing of request messages to the application use the event
    model. An application (SipListener) will register with the SIP protocol stack (SipProvider) and
    listen for Request events from the SipProvider. <p> This specification defines a single Request
    event object to handle all Request messages. The Request event encapsulates the Request message
    that can be retrieved from getRequest(). Therefore the event type of a Request event can be
    determined as follows: <p> <code> eventType == RequestEvent.getRequest().getMethod(); </code>
    <p> A Request event also encapsulates the server transaction which handles the Request. <p>
    RequestEvent contains the following elements: <ul> <li> source - the source of the event i.e.
    the SipProvider sending the RequestEvent <li> serverTransaction - the server transaction this
    RequestEvent is associated with.  <li> Request - the Request message received on the SipProvider
    that needs passed to the application encapsulated in a RequestEvent. </ul>
    @version 1.2.2
    @author Monvacon Limited
  */
public class RequestEvent extends java.util.EventObject {
    /**
        Constructs a RequestEvent encapsulating the Request that has been received by the underlying
        SipProvider. This RequestEvent once created is passed to
        SipListener.processRequest(RequestEvent) method of the SipListener for application
        processing.
        @param source The source of ResponseEvent i.e. the SipProvider.
        @param serverTransaction Server transaction upon which this Request was sent.
        @param request The Request message received by the SipProvider.
      */
    public RequestEvent(java.lang.Object source, ServerTransaction serverTransaction, Dialog dialog, Request request) {
        super(source);
        m_serverTransaction = serverTransaction;
        m_dialog = dialog;
        m_request = request;
    }
    /**
        Gets the server transaction associated with this RequestEvent.
        @return The server transaction associated with this RequestEvent.
      */
    public ServerTransaction getServerTransaction() {
        return m_serverTransaction;
    }
    /**
        Gets the Request message associated with this RequestEvent.
        @return The message associated with this RequestEvent.
      */
    public Request getRequest() {
        return m_request;
    }
    /**
        Gets the dialog with which this Event is associated. This method separates transaction
        support from dialog support. This enables application developers to access the dialog
        associated to this event without having to query the transaction associated to the event.
        @return The dialog with which the RequestEvent is associated or null if no dialog exists.
        @since v1.2
      */
    public Dialog getDialog() {
        return m_dialog;
    }
    private ServerTransaction m_serverTransaction;
    private Dialog m_dialog;
    private Request m_request;
}

// vim: sw=4 et tw=72 com=srO\:/**,mb\:*,ex\:*/,srO\:/*,mb\:*,ex\:*/,b\:TRANS,\://,b\:#,\:%,\:XCOMM,n\:>,fb\:-
