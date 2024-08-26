package com.patika.indexservice.model.document;

import lombok.*;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "exceptions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionDocument {

    @Field(type = FieldType.Text)
    private String message;

    @Field(type = FieldType.Text)
    private String createdDateTime;

}
