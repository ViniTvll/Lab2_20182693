
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller

public class    JuegoController {

    private List<Ahorcado> ahorcados = new ArrayList<>();

    @GetMapping("/")
    public String mostrarConfiguracion() {return "configuracion";}


    @PostMapping ("/guardar")
    public String guardarConfiguracion(
        @RequestParam("longitud") String longitud,
        @RequestParam("maxint") String maxint,
        @RequestParam("tema")ArrayList tema,
        Model model){

    Ahorcado ahorcado = new Ahorcado(longitud, maxint, tema);
    ahorcados.add(ahorcado);

    model.addAttribute("ahorcados", ahorcados);

        return "juego";
    }



}
