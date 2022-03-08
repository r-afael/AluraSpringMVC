package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("The Theory of Gambling and Statistical Logic");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/41HX8szGiOL._SX331_BO1,204,203,200_.jpg");
		pedido.setUrlProduto("https://www.amazon.com/Theory-Gambling-Statistical-Logic-Revised/dp/012240761X/ref=sr_1_2?ie=UTF8&qid=1327436144&sr=8-2");
		pedido.setDescricao("descricao qualquer");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
