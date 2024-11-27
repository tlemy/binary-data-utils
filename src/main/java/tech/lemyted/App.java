package tech.lemyted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tech.lemyted.converter.DecimalConverterS32;
import tech.lemyted.converter.DecimalConverterU32;

@SpringBootApplication
@RestController
@RequestMapping("/converter")
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    
    @GetMapping("/bin-to-dec-u32")
    public long convertBinToDecU(@RequestParam String binStr) 
    {
    	return DecimalConverterU32.convert(binStr);
    }
    
    @GetMapping("/dec-to-bin-u32")
    public String convertDecToBinU(@RequestParam long decNum) 
    {
    	return DecimalConverterU32.toBinary(decNum);
    }
    
    @GetMapping("/bin-to-dec-s32")
    public long convertBinToDecS(@RequestParam String binStr) 
    {
    	return DecimalConverterS32.convert(binStr);
    }
    
    @GetMapping("/dec-to-bin-s32")
    public String convertDecToBinS(@RequestParam long decNum) 
    {
    	return DecimalConverterS32.toBinary(decNum);
    }
}
