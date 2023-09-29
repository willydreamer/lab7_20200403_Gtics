package com.example.lab7_20200403.repository;

import com.example.lab7_20200403.dto.EstadisticasDto;
import com.example.lab7_20200403.entity.Device;
import com.example.lab7_20200403.entity.Technician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EstadisticasRepository extends JpaRepository<Device,Integer> {
    @Query(nativeQuery = true,value="SELECT l.Country, COUNT(d.DeviceID) AS Numero\n" +
            "FROM location l\n" +
            "JOIN device d ON l.LocationID = d.SiteID\n" +
            "GROUP BY l.Country;")
    List<EstadisticasDto> getEstadisticas();
}
