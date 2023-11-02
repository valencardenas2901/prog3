import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Entrada {

    private List<Productos> productos;

    public Entrada() {
        productos = new ArrayList<>();
        cargarDesdeArchivo();
    }

    private void cargarDesdeArchivo() {
        try (Scanner scanner = new Scanner(new File("productos.csv"))) {
            while (scanner.hasNextLine()) {
                String[] datosProductos = scanner.nextLine().split(",");
                Productos temp = new Productos(datosProductos[0], Integer.parseInt(datosProductos[4]), Integer.parseInt(datosProductos[5]));
                productos.add(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo de municipios: " + e.getMessage());
        }
    }
    
    public int[] productosPorToneladasTodos(){
        int productosToneladas[] = new int [8];
        int i=0;
        while (i<productos.size()){
            Productos temp = productos.get(i);
            
            switch (temp.producto) {
                case "Azucar": productosToneladas[0] += temp.peso;
                                break;
                case "Cafe":   productosToneladas[1] += temp.peso;
                                break;
                case "Bananos o platanos":  productosToneladas[2] += temp.peso;
                                break;
                case "Cacao":   productosToneladas[3] += temp.peso;
                                    break;
                case "Chocolates":  productosToneladas[4] += temp.peso;
                                break;
                case "Palmitos": productosToneladas[5] += temp.peso;
                                break;
                case "Quinua":  productosToneladas[6] += temp.peso;
                                break;
                default:    productosToneladas[7]+=temp.peso;
                            break;
            }
            i++;
        }
        return productosToneladas;
    }
    
    public int[] productosPorToneladas50() {
        int productosToneladas[] = new int[8];
        int i = 0;
        while (i < productos.size()) {
            Productos temp = productos.get(i);

            if(temp.valor>50){
                switch (temp.producto) {
                    case "Azucar":
                        productosToneladas[0] += temp.peso;
                        break;
                    case "Cafe":
                        productosToneladas[1] += temp.peso;
                        break;
                    case "Bananos o platanos":
                        productosToneladas[2] += temp.peso;
                        break;
                    case "Cacao":
                        productosToneladas[3] += temp.peso;
                        break;
                    case "Chocolates":
                        productosToneladas[4] += temp.peso;
                        break;
                    case "Palmitos":
                        productosToneladas[5] += temp.peso;
                        break;
                    case "Quinua":
                        productosToneladas[6] += temp.peso;
                        break;
                    default:
                        productosToneladas[7]+=temp.peso;
                        break;
                }
            }
            i++;
        }
        return productosToneladas;
    }
    
    
}
