package at.htl.boundary;

import at.htl.entity.Vehicle;
import at.htl.entity.dto.VehicleDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Path("/vehicle")
public class VehicleResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<VehicleDto> hello() {
        return List.of(
                new VehicleDto("Opel", "Kadett"),
                new VehicleDto("VW", "Käfer")
        );
    }
}