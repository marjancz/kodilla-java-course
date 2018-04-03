package com.kodilla.rps.figures;

import java.util.List;

public class Rock implements Figure  {
    private String name;
    private List<String> winWith;

    public Rock(String name, List<String> winWith) {
        this.name = name;
        this.winWith = winWith;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getWinWith() {
        return winWith;
    }

    @Override
    public String toString() {
        return name;
    }
}
