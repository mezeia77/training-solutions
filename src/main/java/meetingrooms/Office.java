package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();
//            List.of(
//            new MeetingRoom("Balaton", 10, 5),
//            new MeetingRoom("Duna", 5, 3),
//            new MeetingRoom("Tisza", 3, 3));


    public void addMeetingRoom(MeetingRoom meetingRoom){
        meetingRooms.add(meetingRoom);
    }

    public void printNames(){
        for (MeetingRoom meetingRoom : meetingRooms){
            System.out.println(meetingRoom.getName());
        }
    }

    public void printNamesReverse(){
        for (int i = meetingRooms.size()-1; i>=0; i--){
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEvenNames(){
        for (int i = 0; i<=meetingRooms.size()-1; i+=2){
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printAreas(){
        for(MeetingRoom meetingRoom:meetingRooms){
            System.out.println(meetingRoom.getName());
            System.out.println(meetingRoom.getLength());
            System.out.println(meetingRoom.getWidth());
            System.out.println(meetingRoom.getArea());
        }
    }

    public void printMeetingRoomsWithName(String name){
        for (MeetingRoom meetingRoom: meetingRooms){
            if(meetingRoom.getName().equals(name)){
                System.out.println(meetingRoom.getWidth());
                System.out.println(meetingRoom.getLength());
                System.out.println(meetingRoom.getArea());
            }
        }
    }

    public void printMeetingRoomsContains(String name){
        for (MeetingRoom meetingRoom: meetingRooms){
            if(meetingRoom.getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(meetingRoom.getWidth());
                System.out.println(meetingRoom.getLength());
                System.out.println(meetingRoom.getArea());
            }
        }
    }

    public void printAreasLarger(int area){
        for (MeetingRoom meetingRoom:meetingRooms){
            if(meetingRoom.getArea()>area){
                System.out.println(meetingRoom.getName());
                System.out.println(meetingRoom.getWidth());
                System.out.println(meetingRoom.getLength());
                System.out.println(meetingRoom.getArea());
            }
        }
    }
}
