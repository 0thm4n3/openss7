/*****************************************************************************

 @(#) $Id: m2paMIB.h,v 0.9.2.2 2008-12-31 16:04:40 brian Exp $

 -----------------------------------------------------------------------------

 Copyright (c) 2001-2008  OpenSS7 Corporation <http://www.openss7.com/>
 Copyright (c) 1997-2001  Brian F. G. Bidulock <bidulock@openss7.org>

 All Rights Reserved.

 This program is free software; you can redistribute it and/or modify it under
 the terms of the GNU Affero General Public License as published by the Free
 Software Foundation; version 3 of the License.

 This program is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License for more
 details.

 You should have received a copy of the GNU Affero General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>, or
 write to the Free Software Foundation, Inc., 675 Mass Ave, Cambridge, MA
 02139, USA.

 -----------------------------------------------------------------------------

 U.S. GOVERNMENT RESTRICTED RIGHTS.  If you are licensing this Software on
 behalf of the U.S. Government ("Government"), the following provisions apply
 to you.  If the Software is supplied by the Department of Defense ("DoD"), it
 is classified as "Commercial Computer Software" under paragraph 252.227-7014
 of the DoD Supplement to the Federal Acquisition Regulations ("DFARS") (or any
 successor regulations) and the Government is acquiring only the license rights
 granted herein (the license rights customarily provided to non-Government
 users).  If the Software is supplied to any unit or agency of the Government
 other than DoD, it is classified as "Restricted Computer Software" and the
 Government's rights in the Software are defined in paragraph 52.227-19 of the
 Federal Acquisition Regulations ("FAR") (or any successor regulations) or, in
 the cases of NASA, in paragraph 18.52.227-86 of the NASA Supplement to the FAR
 (or any successor regulations).

 -----------------------------------------------------------------------------

 Commercial licensing and support of this software is available from OpenSS7
 Corporation at a fee.  See http://www.openss7.com/

 -----------------------------------------------------------------------------

 Last Modified $Date: 2008-12-31 16:04:40 $ by $Author: brian $

 -----------------------------------------------------------------------------

 $Log: m2paMIB.h,v $
 Revision 0.9.2.2  2008-12-31 16:04:40  brian
 - updated mibs

 Revision 0.9.2.1  2008-12-27 10:01:52  brian
 - updated mibs and stubs

 *****************************************************************************/

#ifndef __LOCAL_M2PAMIB_H__
#define __LOCAL_M2PAMIB_H__

#ident "@(#) $RCSfile: m2paMIB.h,v $ $Name:  $($Revision: 0.9.2.2 $) Copyright (c) 2001-2008 OpenSS7 Corporation."

/*
 * This file was generated by mib2c and is intended for use as a mib module
 * for the ucd-snmp snmpd agent.
 */
/* our storage structure(s) */
struct m2paMIB_data {
	uint m2paMIB_request;
	int32_t m2paDefaultSctpNoDelay;
	uint32_t m2paDefaultSctpMaxseg;
	int32_t m2paDefaultSctpHeartbeatItvl;
	int32_t m2paDefaultSctpHeartbeat;
	int32_t m2paDefaultSctpRtoInitial;
	int32_t m2paDefaultSctpRtoMin;
	int32_t m2paDefaultSctpRtoMax;
	uint32_t m2paDefaultSctpPathMaxRetrans;
	int32_t m2paDefaultSctpCookieLife;
	int32_t m2paDefaultSctpCookieInc;
	uint32_t m2paDefaultSctpMaxInitRetries;
	uint32_t m2paDefaultSctpMaxBurst;
	uint32_t m2paDefaultSctpAssocMaxRetrans;
	int32_t m2paDefaultSctpSackDelay;
	int32_t m2paDefaultSctpLifetime;
};
struct m2paProtocolProfileTable_data {
	uint m2paProtocolProfileTable_request;
	uint m2paProtocolProfileTable_refs;
	uint8_t *m2paProtocolProfileId;
	int m2paProtocolProfileIdLen;
	uint32_t m2paN1;
	int32_t m2paProving;
	int32_t m2paManagementProvingState;
	int32_t m2paLoopDelayLower;
	int32_t m2paLoopDelayUpper;
	uint32_t m2paTransmissionRateIntervalLower;
	uint32_t m2paTransmissionRateIntervalUpper;
	int32_t m2paSctpNoDelay;
	uint32_t m2paSctpMaxseg;
	int32_t m2paSctpHeartbeatItvl;
	int32_t m2paSctpHeartbeat;
	int32_t m2paSctpRtoInitial;
	int32_t m2paSctpRtoMin;
	int32_t m2paSctpRtoMax;
	uint32_t m2paSctpPathMaxRetrans;
	int32_t m2paSctpCookieLife;
	int32_t m2paSctpCookieInc;
	uint32_t m2paSctpMaxInitRetries;
	uint32_t m2paSctpMaxBurst;
	uint32_t m2paSctpAssocMaxRetrans;
	int32_t m2paSctpSackDelay;
	int32_t m2paSctpLifetime;
	int32_t m2paTimerT1;
	int32_t m2paTimerT2;
	int32_t m2paTimerT2L;
	int32_t m2paTimerT2H;
	int32_t m2paTimerT3;
	int32_t m2paTimerT4N;
	int32_t m2paTimerT4E;
	int32_t m2paTimerT6;
	int32_t m2paTimerT7;
	uint32_t m2paTransCongThresholdAbatementL1Messages;
	uint32_t m2paTransCongThresholdAbatementL1Octets;
	uint32_t m2paTransCongThresholdOnsetL1Messages;
	uint32_t m2paTransCongThresholdOnsetL1Octets;
	uint32_t m2paProvingAttempts;
	uint32_t m2paNumberOfThresholdLevels;
	int32_t m2paCongestionCounting;
	int32_t m2paCongestionReportingBaseObject;
	int32_t m2paTimerTx;
	int32_t m2paTimerTy;
	uint32_t m2paNumberOfCongestionStates;
	uint32_t m2paInitialLevelOfCongestion;
	uint32_t m2paReceiveCongestionThresholdAbatement;
	uint32_t m2paReceiveCongestionThresholdOnset;
	uint32_t m2paReceiveCongestionThresholdDiscard;
	uint8_t *m2paProtocolProfileName;
	int m2paProtocolProfileNameLen;
	uint32_t m2paTransCongThresholdAbatementL2Messages;
	uint32_t m2paTransCongThresholdAbatementL2Octets;
	uint32_t m2paTransCongThresholdOnsetL2Messages;
	uint32_t m2paTransCongThresholdOnsetL2Octets;
	uint32_t m2paTransCongThresholdAbatementL3Messages;
	uint32_t m2paTransCongThresholdAbatementL3Octets;
	uint32_t m2paTransCongThresholdOnsetL3Messages;
	uint32_t m2paTransCongThresholdOnsetL3Octets;
	uint32_t m2paTransCongThresholdDiscardL1Messages;
	uint32_t m2paTransCongThresholdDiscardL1Octets;
	uint32_t m2paTransCongThresholdDiscardL2Messages;
	uint32_t m2paTransCongThresholdDiscardL2Octets;
	uint32_t m2paTransCongThresholdDiscardL3Messages;
	uint32_t m2paTransCongThresholdDiscardL3Octets;
	int32_t m2paProtocolProfileRowStatus;
};

/* storage declarations */
extern struct m2paMIB_data *m2paMIBStorage;
extern struct header_complex_index *m2paProtocolProfileTableStorage;

/* enum definitions from the covered mib sections */

#define M2PAPROVING_TRUE                         1
#define M2PAPROVING_FALSE                        2

#define M2PAMANAGEMENTPROVINGSTATE_NORMAL        0
#define M2PAMANAGEMENTPROVINGSTATE_EMERGENCY     1
#define M2PAMANAGEMENTPROVINGSTATE_NEUTRAL       2

#define M2PASCTPNODELAY_TRUE                     1
#define M2PASCTPNODELAY_FALSE                    2

#define M2PASCTPHEARTBEAT_TRUE                   1
#define M2PASCTPHEARTBEAT_FALSE                  2

#define M2PACONGESTIONCOUNTING_OCTET             0
#define M2PACONGESTIONCOUNTING_MESSAGE           1
#define M2PACONGESTIONCOUNTING_BOTH              2

#define M2PACONGESTIONREPORTINGBASEOBJECT_ROUTESET 0
#define M2PACONGESTIONREPORTINGBASEOBJECT_LINKSETOFCONGESTEDROUTESET 1
#define M2PACONGESTIONREPORTINGBASEOBJECT_LINKOFCONGESTEDROUTESET 2
#define M2PACONGESTIONREPORTINGBASEOBJECT_CONGESTEDLINKOFCONGESTEDROUTE 3

#define M2PADEFAULTSCTPNODELAY_TRUE              1
#define M2PADEFAULTSCTPNODELAY_FALSE             2

#define M2PADEFAULTSCTPHEARTBEAT_TRUE            1
#define M2PADEFAULTSCTPHEARTBEAT_FALSE           2

/* function prototypes */
void init_m2paMIB(void);
void deinit_m2paMIB(void);
int term_m2paMIB(int majorID, int minorID, void *serverarg, void *clientarg);
FindVarMethod var_m2paMIB;
void parse_m2paMIB(const char *, char *);
SNMPCallback store_m2paMIB;
void refresh_m2paMIB(void);
FindVarMethod var_m2paProtocolProfileTable;
int m2paProtocolProfileTable_add(struct m2paProtocolProfileTable_data *);
int m2paProtocolProfileTable_del(struct m2paProtocolProfileTable_data **);
void parse_m2paProtocolProfileTable(const char *, char *);
SNMPCallback store_m2paProtocolProfileTable;
void refresh_m2paProtocolProfileTable(void);

WriteMethod write_m2paN1;
WriteMethod write_m2paProving;
WriteMethod write_m2paManagementProvingState;
WriteMethod write_m2paLoopDelayLower;
WriteMethod write_m2paLoopDelayUpper;
WriteMethod write_m2paTransmissionRateIntervalLower;
WriteMethod write_m2paTransmissionRateIntervalUpper;
WriteMethod write_m2paSctpNoDelay;
WriteMethod write_m2paSctpMaxseg;
WriteMethod write_m2paSctpHeartbeatItvl;
WriteMethod write_m2paSctpHeartbeat;
WriteMethod write_m2paSctpRtoInitial;
WriteMethod write_m2paSctpRtoMin;
WriteMethod write_m2paSctpRtoMax;
WriteMethod write_m2paSctpPathMaxRetrans;
WriteMethod write_m2paSctpCookieLife;
WriteMethod write_m2paSctpCookieInc;
WriteMethod write_m2paSctpMaxInitRetries;
WriteMethod write_m2paSctpMaxBurst;
WriteMethod write_m2paSctpAssocMaxRetrans;
WriteMethod write_m2paSctpSackDelay;
WriteMethod write_m2paSctpLifetime;
WriteMethod write_m2paTimerT1;
WriteMethod write_m2paTimerT2;
WriteMethod write_m2paTimerT2L;
WriteMethod write_m2paTimerT2H;
WriteMethod write_m2paTimerT3;
WriteMethod write_m2paTimerT4N;
WriteMethod write_m2paTimerT4E;
WriteMethod write_m2paTimerT6;
WriteMethod write_m2paTimerT7;
WriteMethod write_m2paTransCongThresholdAbatementL1Messages;
WriteMethod write_m2paTransCongThresholdAbatementL1Octets;
WriteMethod write_m2paTransCongThresholdOnsetL1Messages;
WriteMethod write_m2paTransCongThresholdOnsetL1Octets;
WriteMethod write_m2paProvingAttempts;
WriteMethod write_m2paNumberOfThresholdLevels;
WriteMethod write_m2paCongestionCounting;
WriteMethod write_m2paCongestionReportingBaseObject;
WriteMethod write_m2paTimerTx;
WriteMethod write_m2paTimerTy;
WriteMethod write_m2paNumberOfCongestionStates;
WriteMethod write_m2paInitialLevelOfCongestion;
WriteMethod write_m2paReceiveCongestionThresholdAbatement;
WriteMethod write_m2paReceiveCongestionThresholdOnset;
WriteMethod write_m2paReceiveCongestionThresholdDiscard;
WriteMethod write_m2paProtocolProfileName;
WriteMethod write_m2paTransCongThresholdAbatementL2Messages;
WriteMethod write_m2paTransCongThresholdAbatementL2Octets;
WriteMethod write_m2paTransCongThresholdOnsetL2Messages;
WriteMethod write_m2paTransCongThresholdOnsetL2Octets;
WriteMethod write_m2paTransCongThresholdAbatementL3Messages;
WriteMethod write_m2paTransCongThresholdAbatementL3Octets;
WriteMethod write_m2paTransCongThresholdOnsetL3Messages;
WriteMethod write_m2paTransCongThresholdOnsetL3Octets;
WriteMethod write_m2paTransCongThresholdDiscardL1Messages;
WriteMethod write_m2paTransCongThresholdDiscardL1Octets;
WriteMethod write_m2paTransCongThresholdDiscardL2Messages;
WriteMethod write_m2paTransCongThresholdDiscardL2Octets;
WriteMethod write_m2paTransCongThresholdDiscardL3Messages;
WriteMethod write_m2paTransCongThresholdDiscardL3Octets;
WriteMethod write_m2paProtocolProfileRowStatus;
WriteMethod write_m2paDefaultSctpNoDelay;
WriteMethod write_m2paDefaultSctpMaxseg;
WriteMethod write_m2paDefaultSctpHeartbeatItvl;
WriteMethod write_m2paDefaultSctpHeartbeat;
WriteMethod write_m2paDefaultSctpRtoInitial;
WriteMethod write_m2paDefaultSctpRtoMin;
WriteMethod write_m2paDefaultSctpRtoMax;
WriteMethod write_m2paDefaultSctpPathMaxRetrans;
WriteMethod write_m2paDefaultSctpCookieLife;
WriteMethod write_m2paDefaultSctpCookieInc;
WriteMethod write_m2paDefaultSctpMaxInitRetries;
WriteMethod write_m2paDefaultSctpMaxBurst;
WriteMethod write_m2paDefaultSctpAssocMaxRetrans;
WriteMethod write_m2paDefaultSctpSackDelay;
WriteMethod write_m2paDefaultSctpLifetime;
#endif				/* __LOCAL_M2PAMIB_H__ */