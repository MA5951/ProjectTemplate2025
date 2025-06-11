
package frc.robot;

import com.MAutils.Controllers.PS5MAController;
import com.MAutils.RobotControl.DeafultRobotContainer;

import edu.wpi.first.wpilibj2.command.Command;

public class RobotContainer extends DeafultRobotContainer{

  public RobotContainer() {
    setDriverController(new PS5MAController(0));
    setDriverController(new PS5MAController(1));


    configureBindings();
  }

  private void configureBindings() {
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
