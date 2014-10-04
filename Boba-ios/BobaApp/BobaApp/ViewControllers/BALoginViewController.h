//
//  BALoginViewController.h
//  BobaApp
//
//  Created by Hyun Bin Kim on 2014-10-04.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface BALoginViewController : UIViewController

@property (weak) UITextField IBOutlet *usernameField;
@property (weak) UITextField IBOutlet *passwordField;
@property (weak) UIButton IBOutlet *loginButton;
@property (weak) UIButton IBOutlet *loginWithFacebook;
@property (weak) UIButton IBOutlet *loginWithGoogle;

- (IBAction)loginButtonPressed:(id)sender;
- (IBAction)loginWithFacebookPressed:(id)sender;
- (IBAction)loginWithGooglePressed:(id)sender;

@end
