package lukasz.nowogorski.SpringBoot.Jackson;

import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.text.DateFormat;
import java.util.Locale;

public class Jackson2ObjectMapperBuilderCustomizerDemo implements Jackson2ObjectMapperBuilderCustomizer {


    @Override
    public void customize(Jackson2ObjectMapperBuilder jacksonObjectMapperBuilder) {
        jacksonObjectMapperBuilder.configure(Jackson2ObjectMapperBuilder.xml().build());

        jacksonObjectMapperBuilder.autoDetectFields(true);
        jacksonObjectMapperBuilder.autoDetectGettersSetters(true);

        jacksonObjectMapperBuilder.createXmlMapper(true);
        jacksonObjectMapperBuilder.dateFormat(DateFormat.getDateInstance(2, Locale.UK));


    }
}
