package com.patika.indexservice.model.document;

import lombok.*;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "logs")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LogDocument {

    @Field(type = FieldType.Text)
    private String message;
    @Field(type = FieldType.Text)
    private String createdDateTime;

}
