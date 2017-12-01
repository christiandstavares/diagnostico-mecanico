import { ItemCarro } from './item-carro';

export class Carro {

    id: number;
    modelo: string;
    ano: number;
    placa: string;
    km: number;
    itens: ItemCarro[];
}