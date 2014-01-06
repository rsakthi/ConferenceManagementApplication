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
 * Class Description : This Entity Class will represent the Talk Information.
 * 
 * @Source File : Talk.java
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
public class Talk{
	
	/**
	 * The dealerID attribute is used to store the unique ID for dealer.
	 */
	private String talkname;
	
	/**
	 * The dealerID attribute is used to store the unique ID for dealer.
	 */
	Schedule schedule;
	
	/**
	 * The dealerID attribute is used to store the unique ID for dealer.
	 */
	boolean isScheduled;
	
	/**
	 * @param talkname
	 * @param duration
	 */
	public Talk(String talkname, int durationinmins) {
		//TODO: Need to validate if the duration is in mins
		this.talkname = talkname;
		schedule = new Schedule(durationinmins);		
	}

	/**
	 * @return Returns the region.
	 */
	public String getTalkname() {
		return talkname;
	}

	/**
	 * @param region
	 *            The region to set.
	 */
	public void setTalkname(String talkname) {
		this.talkname = talkname;
	}


	/**
	 * @return the schedule
	 */
	public Schedule getSchedule() {
		return schedule;
	}


	/**
	 * @param schedule the schedule to set
	 */
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	/**
	 * @return Returns the region.
	 */
	public int getDuration() {
		return schedule.getTalkduration();
	}

	/**
	 * @param region
	 *            The region to set.
	 */
	public void setDuration(int duration) {
		this.schedule.setTalkduration(duration);  ;
	}


	/**
	 * @param isScheduled the isScheduled to set
	 */
	public void setScheduled(boolean isScheduled) {
		if(isScheduled == false){
			schedule.setStarttime("");
			schedule.setEndtime("");
			schedule.setSession(Session.EMPTY);
		}
		this.isScheduled = isScheduled;
	}


	/**
	 * @return the isScheduled
	 */
	public boolean isScheduled() {
		return isScheduled;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((talkname == null) ? 0 : talkname.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Talk)) {
			return false;
		}
		Talk other = (Talk) obj;
		if (talkname == null) {
			if (other.talkname != null) {
				return false;
			}
		} else if (!talkname.equals(other.talkname)) {
			return false;
		}
		return true;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Talk ["
				+ (talkname != null ? "talkname = " + talkname + ", " : "")
				+ (schedule != null ? "duration = " + schedule.getTalkduration() +" mins " 
				+ ((schedule.getStarttime() != "") ? " starttime = " + schedule.getStarttime() + " " + schedule.getSession() : "") 
				+ ((schedule.getEndtime() != "") ? " endtime = " + schedule.getEndtime() + " " + schedule.getSession() : "")
				: "")+"]";
	}

}
