package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;

@Autonomous(name="VisionTestAuto", group="Linear Opmode")
public class VisionTestAuto extends LinearOpMode {

    //Declare OpMode Members

    //Things to do before main control loop

    @Override
    public void runOpMode() {

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Initialize camera from hardware map
        int cameraMonitorViewId = hardwareMap.appContext.getResources().getIdentifier("cameraMonitorViewId", "id", hardwareMap.appContext.getPackageName());
        VuforiaLocalizer.Parameters parameters = new VuforiaLocalizer.Parameters(cameraMonitorViewId);

        parameters.vuforiaLicenseKey = "Abk5u6b/////AAABmZz1f8B6u0kxhHyf3RN0vJI6/8NaT8MRzRx1bk7W1IJUB0ES3du1egL+v5SLCSczu/74rdySMra/3X2L9REKQFKPPSeNhb/W8ZLSY58n1CnPVwU4fd1RMm6z9VhblGFkDJ6dSGzKuyMyCum4xtpZXSTwLOHSqjjpJmo/RBMkOH2qict9a30NYFKmOl8AETBSj5vaKFBkhOR0T6gG3Zcps4wJJ7RR/JACseKXjhZ/j71MagAVVrfbxFgkgz1572FOA4MlImbDwsf7I3HVFcFYhBuRA/IFOd62r88xUL//IGivXGxMVZb2Knkgs3MUA7mJd4mF7Es0pZJzdVLbaboRAxgp/D9k7xNS4VeO7+22+1pW";
        parameters.cameraDirection = VuforiaLocalizer.CameraDirection.BACK;
        //vuforia = ClassFactory.getInstance().createVuforia(parameters);


        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        while (opModeIsActive()) {
            //Control loop of autonomous mode


            telemetry.update();
        }
    }
}
