//
//  colored_vs.glsl
//  GLChart
//
//  Created by Pavel Kosov on 10/04/2017.
//  Copyright © 2017 IQOPTION. All rights reserved.
//

attribute vec4 a_Position;
attribute vec4 a_Color;
uniform mat4 u_TransMatrix;
varying vec4 v_Color;

void main()
{
   v_Color = a_Color;
   gl_Position = u_TransMatrix * a_Position;
}
