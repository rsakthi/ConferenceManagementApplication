package com.tw.entity;

/****************************************************************************************************
 *																		  							*
 * Copyright Information         																	*
 *          								 														*
 * This Application is prepared for Thoughtworks Inc. as part of its Interview Process				*
 * No aspect of this Application may be reproduced or disclosed without Thoughtworks' Authorization	*
 *																									*
 * All Rights Reserved.													   							*
 * 																									*
 ****************************************************************************************************/

/**
 * Class Description : This Schedule class will represent the Scheduling Information.
 * 
 * @Source File : Schedule.java
 * Author Name  : Sakthi Ramasamy 
 * Created On 	: 04-Jan-2014
 * Version 		: 1 
 * Modification History : 
 * Modified by :
 *  
 */

/**
 * This class is the business layer where the exact business logic for each and
 * every method.
 *  
 */
public class Schedule {
	
	/**
	 * The dealerID attribute is used to store the unique ID for dealer.
	 */
	private int talkduration; //It should be in minutes
	
	/**
	 * The dealerID attribute is used to store the unique ID for dealer.
	 */
	private String starttime;
	
	/**
	 * The dealerID attribute is used to store the unique ID for dealer.
	 */
	private String endtime;

	/**
	 * The dealerID attribute is used to store the unique ID for dealer.
	 */
	Session session;
	
	public Schedule(int talkduration) {
		super();
		this.talkduration = talkduration;
	}
	
	/**
	 * @return Returns the region.
	 */	
	public int getTalkduration() {
		return talkduration;
	}
	
	/**
	 * @param region
	 *            The region to set.
	 */
	public void setTalkduration(int talkduration) {
		this.talkduration = talkduration;
	}
	
	/**
	 * @return Returns the region.
	 */
	public String getStarttime() {
		return starttime;
	}
	
	/**
	 * @param region
	 *            The region to set.
	 */
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	
	/**
	 * @return Returns the region.
	 */
	public String getEndtime() {
		return endtime;
	}
	
	/**
	 * @param region
	 *            The region to set.
	 */
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	
	/**
	 * @return Returns the region.
	 */
	public Session getSession() {
		return session;
	}
	
	/**
	 * @param region
	 *            The region to set.
	 */
	public void setSession(Session session) {
		this.session = session;
	}	
	
}
