package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@SuppressWarnings("unchecked")
public class RestController {

	List<String> listofData = new ArrayList<String>();

	@GetMapping("/getWord/{word}")
	public ResponseEntity<Object> getWordInList(@PathVariable("word") String word) {

		if (listofData.contains(word)) {
			return ResponseEntity.ok().build();
		} else
			return (ResponseEntity<Object>) ResponseEntity.status(404);
	}

	@DeleteMapping("/deleteWord/{word}")
	public ResponseEntity<Object> deleteWordInList(@PathVariable("word") String word) {

		if (listofData.contains(word)) {
			listofData.remove(word);
			return ResponseEntity.ok().build();
		} else
			return (ResponseEntity<Object>) ResponseEntity.status(404);
	}

	@PostMapping("/deleteWord/{word}")
	public ResponseEntity<Object> addWordInList(@PathVariable("word") String word) {

		listofData.add(word);
		return ResponseEntity.ok().build();

	}

	@PutMapping("/deleteWord/{oldword}/{newword}")
	public ResponseEntity<Object> updateWordInList(@PathVariable("oldword") String oldword,
			@PathVariable("newword") String newword) {

		if (listofData.contains(oldword)) {

			listofData.remove(oldword);
			listofData.add(newword);
			return ResponseEntity.ok().build();
		} else
			return (ResponseEntity<Object>) ResponseEntity.status(404);

	}

}
