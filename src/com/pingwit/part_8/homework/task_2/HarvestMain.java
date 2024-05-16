package com.pingwit.part_8.homework.task_2;

import java.math.BigDecimal;

public class HarvestMain {
    public static void main(String[] args) {
        Harvest[] harvest = new Harvest[3];
        Harvest rice = new Harvest(1L, "field", "rice", new BigDecimal(10));
        harvest[0] = new Harvest(1L, "field", "rice", new BigDecimal(10));
        HarvestStatisticService statisticService = new HarvestStatisticService();
        HarvestStatic[] result = statisticService.calculate(harvest);

    }
}
