import dio.gof.facade.Facade;
import dio.gof.singleton.SingletonEager;
import dio.gof.singleton.SingletonLazy;
import dio.gof.singleton.SingletonLazyHolder;
import dio.gof.strategy.Comportamento;
import dio.gof.strategy.ComportamentoAgressivo;
import dio.gof.strategy.ComportamentoDefensivo;
import dio.gof.strategy.ComportamentoNormal;
import dio.gof.strategy.Robo;

public class Test{

        public static void main(String[] args) {
            //singleton 
        
            SingletonLazy lazy = SingletonLazy.getInstancia();
            System.out.println(lazy);
            lazy = SingletonLazy.getInstancia();
            System.out.println(lazy);
                
            SingletonEager eager =  SingletonEager.getInstancia();
            System.out.println(eager);
            eager =  SingletonEager.getInstancia();
            System.out.println(eager);
        
            SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
            System.out.println(lazyHolder);
            lazyHolder = SingletonLazyHolder.getInstancia();
            System.out.println(lazyHolder);
        
        
            //strategy
            Comportamento defensivo = new ComportamentoDefensivo();
            Comportamento normal = new ComportamentoNormal();
            Comportamento agressivo = new ComportamentoAgressivo();
        
            Robo robo = new Robo();
            robo.setComportamento(normal);
            robo.mover();
            robo.mover();
            robo.setComportamento(agressivo);
            robo.mover();
            robo.mover();
            robo.mover();
            robo.setComportamento(defensivo);
          
            //facade
             Facade facade = new Facade();
            facade.MigrarCliente("Theo", "12233130");
        }
}

