package tech.lemyted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tech.lemyted.converter.DecimalConverterU32;

@SpringBootApplication
@RestController
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    
    @GetMapping("/bin-to-dec-u32")
    public long convertBinToDec(@RequestParam String binStr) 
    {
    	return DecimalConverterU32.convert(binStr);
    }
    
    @GetMapping("/dec-to-bin-u32")
    public String convertDecToBin(@RequestParam long decNum) 
    {
    	return DecimalConverterU32.toBinary(decNum);
    }
}
