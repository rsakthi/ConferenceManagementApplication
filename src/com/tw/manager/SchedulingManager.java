package com.tw.manager;

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
 * Class Description : This manager class is responsible for all the Scheduling Logic.
 * 
 * @Source File : SchedulingManager.java
 * Author Name  : Sakthi Ramasamy 
 * Created On 	: 04-Jan-2014
 * Version 		: 1 
 * Modification History : 
 * Modified by :
 *  
 */

import java.util.ArrayList;
import java.util.List;

import com.tw.entity.Schedule;
import com.tw.entity.Session;
import com.tw.entity.Talk;
import com.tw.entity.Track;
import com.tw.utils.ConferenceUtils;


public class SchedulingManager {
				
		//Morning sessions begin at 9am and must finish by 12 noon - 3 hours / 180 mins
		//Afternoon sessions begin at 1pm and must finish in time for the networking event. - 3 hours / 180 mins
		//The networking event can start no earlier than 4:00 and no later than 5:00.
				
		public void scheduleTracks(List<Talk> paramtalklist){
			
	
			System.out.println("MORNING SESSION");
			for(int k = 0; k < morningtalk.size(); k++){
			//	System.out.println(((morningtalk.get(k).getSchedule().getStarttime()/60)+0.01)+ " " +morningtalk.get(k).getSchedule().getSession() + " " +(morningtalk.get(k)).getTalkname() +" - "+ morningtalk.get(k).getDuration());
			}
			System.out.println("EVENING SESSION");
			for(int l = 0; l < eveningtalk.size(); l++){
				System.out.println((eveningtalk.get(l).getSchedule().getStarttime())+ " " + eveningtalk.get(l).getSchedule().getSession() +" - "+ (eveningtalk.get(l)).getTalkname() +" - "+ eveningtalk.get(l).getDuration());				
			}
		}		
		
		public double getTime(double paramtime){
			return 0;
		}
}
