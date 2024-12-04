package tech.lemyted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tech.lemyted.converter.DecimalConverterS32;
import tech.lemyted.converter.DecimalConverterU32;
import tech.lemyted.converter.RomanConverter;

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
    public long convertBinToDecU(@RequestParam String target) 
    {
    	return DecimalConverterU32.toDecimal(target);
    }
    
    @GetMapping("/dec-to-bin-u32")
    public String convertDecToBinU(@RequestParam long target)
    {
    	return DecimalConverterU32.toBinary(target);
    }
    
    @GetMapping("/bin-to-dec-s32")
    public long convertBinToDecS(@RequestParam String target) 
    {
    	return DecimalConverterS32.toDecimal(target);
    }
    
    @GetMapping("/dec-to-bin-s32")
    public String convertDecToBinS(@RequestParam long target) 
    {
    	return DecimalConverterS32.toBinary(target);
    }
    
    @GetMapping("rom-to-dec")
    public int convertRomToDec(@RequestParam String target)
    {
    	return RomanConverter.toDecimal(target);
    }
    
    @GetMapping("dec-to-rom")
    public String convertDecToRom(@RequestParam int target)
    {
    	return RomanConverter.toRoman(target);
    }
}
