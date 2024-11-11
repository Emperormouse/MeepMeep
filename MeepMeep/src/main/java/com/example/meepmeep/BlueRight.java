package com.example.meepmeep;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;

import org.rowlandhall.meepmeep.MeepMeep;
import org.rowlandhall.meepmeep.roadrunner.DefaultBotBuilder;
import org.rowlandhall.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class BlueRight {
    private static final double timeToDropBlock = 0.5;
    private static final double timeToRotateArm = 1.5;
    private static final double timeToGrabBlock = 0.5;
    private static final Pose2d startPose = new Pose2d(40, 60, Math.toRadians(0));

    public static RoadRunnerBotEntity run(MeepMeep meepMeep) {
        return new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 15)
                .followTrajectorySequence(drive -> drive.trajectorySequenceBuilder(startPose)
                        .strafeTo(new Vector2d(55, 55))
                        //open claw
                        .waitSeconds(timeToDropBlock)

                        .strafeTo(new Vector2d(48, 45))
                        //extend arm
                        .waitSeconds(timeToRotateArm)
                        //close claw
                        .waitSeconds(timeToGrabBlock)
                        //retract arm
                        .waitSeconds(timeToRotateArm)

                        .strafeTo(new Vector2d(55, 55))
                        //open claw
                        .waitSeconds(timeToDropBlock)

                        .strafeTo(new Vector2d(58, 45))
                        //extend arm
                        .waitSeconds(timeToRotateArm)
                        //close claw
                        .waitSeconds(timeToGrabBlock)
                        //retract arm
                        .waitSeconds(timeToRotateArm)

                        .strafeTo(new Vector2d(55, 55))
                        //open claw
                        .waitSeconds(timeToDropBlock)

                        .strafeTo(new Vector2d(50, 26))
                        //extend arm
                        .waitSeconds(timeToRotateArm)
                        //close claw
                        .waitSeconds(timeToGrabBlock)
                        //retract arm
                        .waitSeconds(timeToRotateArm)

                        .strafeTo(new Vector2d(55, 55))
                        //open claw
                        .waitSeconds(timeToDropBlock)


                        .strafeTo(new Vector2d(40, 60))
                        //extend arm
                        .waitSeconds(timeToRotateArm)

                        .build());
    }
}
