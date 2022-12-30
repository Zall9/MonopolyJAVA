package fr.univ.savoie.isc;

import java.util.Objects;

public class AngleCase extends Case {

    AngleCaseType type;
    public AngleCase(String name, AngleCaseType type) {
        super(name);
        this.type = type;
    }
    public AngleCase(String name) {
        super(name);
    }

    @Override
    public void action(Player player) {
    }

    @Override
    public void actionOnPass(Player player) {
        switch (this.type) {
            case DEPART:
                player.getPaid(200);
                break;
            case ALLEZ_EN_PRISON:
                break;
            case PRISON:
                break;
            case PARC_GRATUIT:
                break;
        }
    }
}
