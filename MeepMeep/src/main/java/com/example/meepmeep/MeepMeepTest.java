package com.example.meepmeep;

import com.acmerobotics.roadrunner.geometry.Pose2d;

import org.rowlandhall.meepmeep.MeepMeep;
import org.rowlandhall.meepmeep.roadrunner.DefaultBotBuilder;
import org.rowlandhall.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

enum corner {
    RR,
    RL,
    BL,
    BR,
}

public class MeepMeepTest {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);

        corner startPosition = corner.RL;

        RoadRunnerBotEntity myBot = switch (startPosition) {
            case RR -> BlueRight.run(meepMeep);
            case RL -> RedLeft.run(meepMeep);
            case BL -> BlueLeft.run(meepMeep);
            case BR -> BlueRight.run(meepMeep);
        };


        meepMeep.setBackground(MeepMeep.Background.FIELD_INTOTHEDEEP_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}