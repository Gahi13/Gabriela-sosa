import { Component, OnInit } from '@angular/core';
import { persona } from 'src/app/Model/Persona.model';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-info',
  templateUrl: './info.component.html',
  styleUrls: ['./info.component.css']
})
export class InfoComponent implements OnInit {
 persona: persona = new persona("","","");
  constructor(public personaservice:PersonaService) { }

  ngOnInit(): void {
 this.personaservice.getPersona().subscribe(data => {this.persona =data})
  }

}
