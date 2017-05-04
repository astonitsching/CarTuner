
import java.util.HashMap;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CMS6227
 */
public class Manager {
    
    
    String make;
    String style;
    int year;
    AbstractVehicle currentVehicle;
    public PartList rimsList;
    public PartList tiresList;
    public PartList enginesList;
    public PartList ssList;
    public PartList speakerList;
    public PartList spoilerList;
    public Budget budget = new Budget();
    public PartsPanel partsPanel;
    
    private static final Manager INSTANCE = new Manager();
    
    private Manager(){
        //initializing rims
        rimsList = new PartList();
        Part daytona_rim = new Part(100, "rsc/daytona_rim.png");
        rimsList.allParts.add(daytona_rim);
        rimsList.visibleParts.add(daytona_rim);
        Part smootie_rim = new Part(150, "rsc/smootie_rim.png");
        rimsList.allParts.add(smootie_rim);
        rimsList.visibleParts.add(smootie_rim);
        
        //initializing tires
        tiresList = new PartList();
        Part all_season = new Part(300, "rsc/all_season_tire.png");
        tiresList.allParts.add(all_season);
        tiresList.visibleParts.add(all_season);
        Part snow_tire = new Part(250, "rsc/snow_tire.jpeg");
        tiresList.allParts.add(snow_tire);
        tiresList.visibleParts.add(snow_tire);
        
        //initializing engine
        enginesList = new PartList();
        Part straight_engine = new Part(500, "rsc/straight_engine.jpg");
        enginesList.allParts.add(straight_engine);
        enginesList.visibleParts.add(straight_engine);
        Part v_engine = new Part(600, "rsc/v_engine.jpg");
        enginesList.allParts.add(v_engine);
        enginesList.visibleParts.add(v_engine);
        
        //initializing sound system
        ssList = new PartList();
        Part system1 = new Part(375, "rsc/electronics1.jpeg");
        ssList.allParts.add(system1);
        ssList.visibleParts.add(system1);
        Part system2 = new Part(415, "rsc/electronics2.jpeg");
        ssList.allParts.add(system2);
        ssList.visibleParts.add(system2);
        Part system3 = new Part(415, "rsc/electronics3.jpeg");
        ssList.allParts.add(system3);
        ssList.visibleParts.add(system3);
        
        //initializing speak
        speakerList = new PartList();
        Part speaker1 = new Part(75, "rsc/sound_system1.jpg");
        speakerList.allParts.add(speaker1);
        speakerList.visibleParts.add(speaker1);
        Part speaker2 = new Part(180, "rsc/sound_system2.jpg");
        speakerList.allParts.add(speaker2);
        speakerList.visibleParts.add(speaker2);
        
        //initializing spoiler
        spoilerList = new PartList();
        Part spoiler1 = new Part(255, "rsc/spoiler1.jpg");
        spoilerList.allParts.add(spoiler1);
        spoilerList.visibleParts.add(spoiler1);
        Part spoiler2 = new Part(160, "rsc/spoiler2.jpg");
        spoilerList.allParts.add(spoiler2);
        spoilerList.visibleParts.add(spoiler2);
    }
    
    public static Manager getInstance()
    {
        return INSTANCE;
    }
    public void setCarAttributes(String make, String style, int year)
    {
        this.make = make;
        this.style = style;
        this.year = year;
    }
    public void createVehicle()
    {
        currentVehicle = VehicleFactory.addVehicle(make);

    }
}
